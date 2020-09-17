import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'titleCase'
})
export class TitleCasePipe implements PipeTransform {

  transform(value: string, ...args: unknown[]): string {
    
    if (!value) return null;
    let words: string[] = value.split(' ');

    for (let i = 0; i < words.length; i++) {

      let word = words[i];

      if (i > 0 && this.isPrepositionOrArticle(word)) {
        words[i] = word.toLowerCase();
      } else {
        words[i] = (word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
      }

    }

    return words.join(' ');
    
  }

  private isPrepositionOrArticle(word: string): boolean {
    let preps = ['of', 'in', 'over', 'the', 'a', 'with', 'through', 'is'];
    return preps.includes(word.toLowerCase());
  }

}

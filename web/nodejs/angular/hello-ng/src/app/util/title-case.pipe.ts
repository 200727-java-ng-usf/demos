import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'titleCase'
})
export class TitleCasePipe implements PipeTransform {

<<<<<<< HEAD
  transform(value: string, ...args: string[]): string {
=======
  transform(value: string, ...args: unknown[]): string {
    
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    if (!value) return null;
    let words: string[] = value.split(' ');

    for (let i = 0; i < words.length; i++) {
<<<<<<< HEAD
      const word = words[i];
      
=======

      let word = words[i];

>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
      if (i > 0 && this.isPrepositionOrArticle(word)) {
        words[i] = word.toLowerCase();
      } else {
        words[i] = (word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
      }
<<<<<<< HEAD
    }

    return words.join(' ');
  }

  private isPrepositionOrArticle(word: string): boolean {
    let preps = [
      'of',
      'in',
      'over',
      'the',
      'a',
      'with',
      'through',
      'is'
    ];
=======

    }

    return words.join(' ');
    
  }

  private isPrepositionOrArticle(word: string): boolean {
    let preps = ['of', 'in', 'over', 'the', 'a', 'with', 'through', 'is'];
>>>>>>> e8242646d3e125196ce02b14c450f60a06b29675
    return preps.includes(word.toLowerCase());
  }

}
